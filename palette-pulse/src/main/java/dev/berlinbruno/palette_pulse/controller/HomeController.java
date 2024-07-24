package dev.berlinbruno.palette_pulse.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        // Set model attributes for Thymeleaf
        model.addAttribute("pageTitle", "PalettePulse - Ignite Your Creativity with Vibrant Colors");
        model.addAttribute("navbarBrand", "PalettePulse");
        model.addAttribute("homeLink", "Home");
        model.addAttribute("featuresLink", "Features");
        model.addAttribute("gettingStartedLink", "Getting Started");
        model.addAttribute("contactLink", "Contact");

        model.addAttribute("heroHighlight", "PalettePulse");
        model.addAttribute("heroDescription", "The ultimate tool for color enthusiasts, designers, and artists. Convert colors, select themes, and create stunning color templates with ease.");
        model.addAttribute("getStartedButton", "Get Started");

        // Feature list example
        model.addAttribute("features", List.of(
                new Feature("Color Conversion", "Effortlessly convert colors between different formats (HEX, RGB, HSL, and more) with precision and ease."),
                new Feature("Theme Selection", "Choose from a vast array of pre-designed themes or create your own to bring your projects to life."),
                new Feature("Color Templates", "Design and save beautiful color templates to ensure consistency and harmony in your creative work."),
                new Feature("User-Friendly Interface", "An intuitive and easy-to-use interface designed for both beginners and professionals."),
                new Feature("Customization", "Personalize your workspace and tools to match your unique workflow and preferences.")
        ));

        model.addAttribute("featuresTitle", "Key Features");
        model.addAttribute("gettingStartedTitle", "Getting Started");
        model.addAttribute("gettingStartedDescription", "To get started with PalettePulse, clone the repository and follow the setup instructions below:");
        model.addAttribute("gettingStartedNote", "For a complete guide, refer to our documentation.");

        model.addAttribute("contactTitle", "Contact Us");
        model.addAttribute("contactDescription", "For any questions or feedback, please reach out to us at");
        model.addAttribute("contactEmail", "your-email@example.com");

        model.addAttribute("footerText", "&copy; 2024 PalettePulse. All rights reserved.");

        return "index"; // Thymeleaf template located at src/main/resources/templates/index.html
    }

    // Additional methods can be added here for other routes or functionalities

    // Inner class to represent feature data
    @Setter
    @Getter
    public static class Feature {
        private String title;
        private String description;

        public Feature(String title, String description) {
            this.title = title;
            this.description = description;
        }

    }
}
