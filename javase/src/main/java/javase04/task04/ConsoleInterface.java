package javase04.task04;

import com.google.gson.Gson;
import javase04.task04.moviesCatalog.Movie;
import javase04.task04.moviesCatalog.movieRoles.Actor;
import javase04.task04.pattern.Repository;

import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/**
 * Created by Mao Shaco on 11/1/2015.
 */
public class ConsoleInterface {
    private Repository<Actor> actorRepository;
    private Repository<Movie> movieList;
    private Gson gson = new Gson();

    public void run(PrintStream out) {
        loadApplication();
        showHelp(out);

        while (true) {
            Scanner in = new Scanner(System.in);
            String buff = in.nextLine().toLowerCase();

            switch (buff) {
                case "help": {
                    showHelp(out);
                    break;
                }
                case "add": {
                    addNewMovie(out, in);
                    break;
                }
                case"add actor":{
                    addActor(out,in);
                    break;
                }
                case"remove actor":{
                    removeActor(out,in);
                    break;
                }
                case"add actor to movie":{
                    addActorToMovie(out, in);
                    break;
                }
                case"remove actor from movie":{
                    removeActorFromMovie(out, in);
                    break;
                }
                case "show": {
                    movieList.showCollection(out);
                    break;
                }
                case "show actors": {
                    actorRepository.showCollection(out);
                    break;
                }
                case "exit": {
                    try {
                        closeApplication();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return;
                }
                default:
                    wrongInput(out);
            }
        }
    }

    private void removeActor(PrintStream out, Scanner in) {
        out.println("Input actor ID from list below");
    }


    private void addActor(PrintStream out, Scanner in) {
        out.println("Input new actor's name");
        String name = in.nextLine();
        out.println("Input new actor's surname");
        String surname = in.nextLine();
        actorRepository.add(new Actor(name, surname));
        out.println("Actor added successfully");
    }

    private void wrongInput(PrintStream out) {
        out.println("Wrong input for this application");
    }

    private void loadApplication() {
        ObjectInputStream ois;
        try {
            ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("actors")));
            actorRepository = (Repository) ois.readObject();
            ois.close();
            ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("movies")));
            movieList = (Repository) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            actorRepository = new Repository<Actor>();
            movieList = new Repository<Movie>();
        }
    }


    private void closeApplication() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("actors"));
        oos.writeObject(actorRepository);
        oos.close();
        oos = new ObjectOutputStream(new FileOutputStream("movies"));
        oos.writeObject(movieList);
        oos.close();

    }

    private void addNewMovie(PrintStream out, Scanner in) {
        out.println("Input movie name");
        String name = in.nextLine();
        out.println("Input year of movie");
        int year = Integer.parseInt(in.nextLine());
        out.println("Input the country");
        String country = in.nextLine();
        movieList.add(new Movie(name, year, country));
        out.println("Movie added successfully");
    }

    private void showHelp(PrintStream out) {
        out.println("Enter <help> to view this list");
        out.println("Enter <add> to add movie");
        out.println("Enter <add actor> to add actor");
        out.println("Enter <add actor to movie> to add actor to movie");
        out.println("Enter <remove actor> to remove actor");
        out.println("Enter <remove actor from movie> to remove actor from movie");
        out.println("Enter <show> to view movies list");
        out.println("Enter <exit> for exit application");
    }
}