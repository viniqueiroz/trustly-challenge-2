package com.viniqueiroz;

import com.viniqueiroz.controllers.ChallengeTwoController;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        ChallengeTwoController controller = new ChallengeTwoController("Vinicius Moura de Queiroz", "Brazilian",
                "Raise to Mars");
        controller.getPresentation();
    }
}
