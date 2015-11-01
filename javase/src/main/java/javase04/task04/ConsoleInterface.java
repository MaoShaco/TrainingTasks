package javase04.task04;

import com.google.gson.Gson;
import javase04.task04.moviesCatalog.Movie;
import javase04.task04.moviesCatalog.movieRoles.Actor;
import javase04.task04.pattern.Repository;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Mao Shaco on 11/1/2015.
 */
public class ConsoleInterface {
    private Repository<Actor> actorRepository;
    private Repository<Movie> movieList;
    private Gson gson = new Gson();

    public void run(PrintStream out) {
        deserializeApplicationData();
        showHelp(out);

        while (true) {
            Scanner in = new Scanner(System.in);
            String buff = in.nextLine().toLowerCase();

            switch (buff) {
                case "help": {
                    showHelp(out);
                    break;
                }
                case "add movie": {
                    addNewMovie(out, in);
                    break;
                }
                case "remove movie": {
                    removeMovie(out, in);
                    break;
                }
                case "add actor": {
                    addActor(out, in);
                    break;
                }
                case "remove actor": {
                    removeActor(out, in);
                    break;
                }
                case "add actor to movie": {
                    addActorToMovie(out, in);
                    break;
                }
                case "remove actor from movie": {
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
                        serializeApplicationData();
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

    private void removeMovie(PrintStream out, Scanner in) {
        try {
            out.println("Input movie ID from the list below");
            movieList.showCollection(out);
            movieList.remove(Integer.parseInt(in.nextLine()));

            out.println("Movie removed successfully");
        } catch (ArrayIndexOutOfBoundsException e) {
            out.println("Wrong input for this list");
        }
    }

    private void removeActorFromMovie(PrintStream out, Scanner in) {
        try {
            out.println("Input movie ID from the list below");
            movieList.showCollection(out);
            Movie movie = movieList.get(Integer.parseInt(in.nextLine()));

            out.println("Input actor ID from list below");
            actorRepository.showCollection(out);
            Actor actor = actorRepository.get(Integer.parseInt(in.nextLine()));
            movie.getActorList().remove(actor);

            out.println("Actor removed from the movie successfully");
        } catch (ArrayIndexOutOfBoundsException e) {
            out.println("Wrong input for this list");
        }
    }

    private void addActorToMovie(PrintStream out, Scanner in) {
        try {
            out.println("Input movie ID from the list below");
            movieList.showCollection(out);
            Movie movie = movieList.get(Integer.parseInt(in.nextLine()));

            out.println("Input actor ID from list below");
            actorRepository.showCollection(out);
            Actor actor = actorRepository.get(Integer.parseInt(in.nextLine()));
            movie.getActorList().add(actor);

            out.println("Actor added to movie successfully");
        } catch (ArrayIndexOutOfBoundsException e) {
            out.println("Wrong input for this list");
        }

    }

    private void removeActor(PrintStream out, Scanner in) {
        try {
            out.println("Input actor ID from list below");
            actorRepository.showCollection(out);
            actorRepository.remove(Integer.parseInt(in.nextLine()));
            out.println("Actor removed successfully");
        } catch (ArrayIndexOutOfBoundsException e) {
            out.println("Wrong input for this list");
        }
    }


    private void addActor(PrintStream out, Scanner in) {
        try {
            out.println("Input new actor's name");
            String name = in.nextLine();
            out.println("Input new actor's surname");
            String surname = in.nextLine();
            actorRepository.add(new Actor(name, surname));
            out.println("Actor added successfully");
        } catch (ArrayIndexOutOfBoundsException e) {
            out.println("Wrong input for this list");
        }
    }

    private void wrongInput(PrintStream out) {
        out.println("Wrong input for this application");
    }

    private void deserializeApplicationData() {
        ObjectInputStream ois;
        try {
            /*ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("actors")));
            actorRepository = (Repository) ois.readObject();
            ois.close();

            ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("movies")));
            movieList = (Repository) ois.readObject();
            ois.close();*/

            BufferedReader br = new BufferedReader(new FileReader("actors.json"));
            actorRepository = gson.fromJson(br, Repository.class);
            br.close();
            br = new BufferedReader(new FileReader("movies.json"));
            movieList = gson.fromJson(br, Repository.class);
            br.close();

        } catch (IOException e/* | ClassNotFoundException e*/) {
            actorRepository = new Repository<Actor>();
            movieList = new Repository<Movie>();
        }
    }


    private void serializeApplicationData() throws IOException {
       /* ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("actors"));
        oos.writeObject(actorRepository);
        oos.close();

        oos = new ObjectOutputStream(new FileOutputStream("movies"));
        oos.writeObject(movieList);
        oos.close();*/

        FileWriter writer = new FileWriter("actors.json");
        writer.write(gson.toJson(actorRepository));
        writer.close();

        writer = new FileWriter("movies.json");
        writer.write(gson.toJson(movieList));
        writer.close();
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
        out.println("Enter <add movie> to add movie");
        out.println("Enter <remove movie> to remove movie");
        out.println("Enter <add actor> to add actor");
        out.println("Enter <add actor to movie> to add actor to movie");
        out.println("Enter <remove actor> to remove actor");
        out.println("Enter <remove actor from movie> to remove actor from movie");
        out.println("Enter <show> to view movies list");
        out.println("Enter <show actors> to view actors list");
        out.println("Enter <exit> for exit application");
    }
}