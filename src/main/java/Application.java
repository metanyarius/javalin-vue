import io.javalin.Javalin;
import io.javalin.plugin.rendering.vue.VueComponent;

public class Application {
    public static void main(String[] args) {
        Javalin app = makeApp();
        app.get("/", new VueComponent("<index></index>"));
    }

    private static Javalin makeApp() {
        return Javalin.create(config -> {
            config.enableWebjars();
        }).start(8080);
    }
}