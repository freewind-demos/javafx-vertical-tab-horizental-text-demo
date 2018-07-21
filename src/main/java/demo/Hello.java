package demo;

import javafx.application.Application;
import javafx.geometry.Side;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Hello extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello");
        Pane root = new Pane() {{
            getChildren().add(createTabs());
        }};
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }

    private Node createTabs() {
        return new TabPane() {{
            getStylesheets().add("tab.css");
            setSide(Side.LEFT);
            setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
            getTabs().addAll(
                    new Tab("tab1") {{
                        setContent(new Pane() {{
                            getChildren().add(new Button("content1"));
                        }});
                    }},
                    new Tab("tab2") {{
                        setContent(new Pane() {{
                            getChildren().add(new Button("content2"));
                        }});
                    }}
            );
        }};
    }

}