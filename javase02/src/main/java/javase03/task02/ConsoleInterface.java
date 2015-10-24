package javase03.task02;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * Created by Mao Shaco on 10/24/2015.
 */
public class ConsoleInterface {
    private Locale enLocale = new Locale("en", "US");
    private Locale ruLocale = new Locale("ru", "RU");

    private ResourceBundle issuesBundle = ResourceBundle.getBundle("issues", new UTF8Control());
    private ResourceBundle interfaceBundle = ResourceBundle.getBundle("interface", new UTF8Control());
    private IssueController issueController = new IssueController(3);

    public void Run() {
        showHelp();
        String buff;

        do {
            Scanner in = new Scanner(System.in);
            buff = in.nextLine().toLowerCase();

            if (buff.equals(interfaceBundle.getString("help"))) {
                showHelp();
                continue;
            }
            if (buff.contains(interfaceBundle.getString("getAnswer"))) {
                showAnswer(buff);
                continue;
            }
            if (buff.equals(interfaceBundle.getString("showQuestions"))) {
                showQuestions();
                continue;
            }
            if (buff.equals(interfaceBundle.getString("changeLanguage"))) {
                changeLocale();
                showHelp();
                continue;
            }
            if (buff.equals(interfaceBundle.getString("exit")))
                break;

            System.out.println(interfaceBundle.getString("noCommand"));
        } while (true);
    }

    private void showHelp() {
        System.out.println(interfaceBundle.getString("helpList"));
    }

    private void showQuestions() {
        String[] questions = this.issueController.getQuestions();
        for (int i = 1; i <= questions.length; i++) {
            System.out.println(i + ". " + issuesBundle.getString(questions[i - 1]));
        }
    }

    private void showAnswer(String buff) {
        buff.lastIndexOf(interfaceBundle.getString("getAnswer"));
        String[] a = buff.split(interfaceBundle.getString("getAnswer"));
        System.out.println(issuesBundle.getString(this.issueController.showAnswer(Integer.parseInt(a[1]))));
    }

    private void changeLocale() {
        if (this.issuesBundle.getLocale().equals(this.enLocale)) {
            this.issuesBundle = ResourceBundle.getBundle("issues", this.ruLocale, new UTF8Control());
            this.interfaceBundle = ResourceBundle.getBundle("interface", this.ruLocale, new UTF8Control());
        } else {
            this.issuesBundle = ResourceBundle.getBundle("issues", this.enLocale, new UTF8Control());
            this.interfaceBundle = ResourceBundle.getBundle("interface", this.enLocale, new UTF8Control());
        }
    }

    private class UTF8Control extends ResourceBundle.Control {

        public ResourceBundle newBundle
                (String baseName, Locale locale, String format, ClassLoader loader, boolean reload)
                throws IllegalAccessException, InstantiationException, IOException {
            String bundleName = toBundleName(baseName, locale);
            String resourceName = toResourceName(bundleName, "properties");
            ResourceBundle bundle = null;
            InputStream stream = null;
            if (reload) {
                URL url = loader.getResource(resourceName);
                if (url != null) {
                    URLConnection connection = url.openConnection();
                    if (connection != null) {
                        connection.setUseCaches(false);
                        stream = connection.getInputStream();
                    }
                }
            } else {
                stream = loader.getResourceAsStream(resourceName);
            }
            if (stream != null) {
                try {
                    bundle = new PropertyResourceBundle(new InputStreamReader(stream, "UTF-8"));
                } finally {
                    stream.close();
                }
            }
            return bundle;
        }
    }
}
