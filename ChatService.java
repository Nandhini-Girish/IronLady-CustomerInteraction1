package com.ironlady.ai.service;

import org.springframework.stereotype.Service;

@Service
public class ChatService {

    public String getReply(String userMessage) {

        userMessage = userMessage.toLowerCase();

        // Programs
        if (userMessage.contains("program")) {
            return "Iron Lady offers career transformation, leadership development, and entrepreneurship programs designed to empower women at different stages of their journey.";
        }

        // Target Audience
        else if (userMessage.contains("who") || userMessage.contains("eligible")) {
            return "Our programs are designed for students, working professionals, aspiring leaders, and women looking to grow personally or professionally.";
        }

        // Services
        else if (userMessage.contains("service") || userMessage.contains("support")) {
            return "Iron Lady provides mentorship, structured learning paths, expert guidance, and a supportive community to help women grow with confidence.";
        }

        // Process
        else if (userMessage.contains("process") || userMessage.contains("how it works")) {
            return "The process is simple: explore programs, choose the right path, register your interest, receive guidance from our team, and begin your transformation journey.";
        }

        // Enrollment
        else if (userMessage.contains("enroll") || userMessage.contains("join")) {
            return "To enroll, share your details through the registration process. Our team will guide you personally to the right program.";
        }

        // Fees
        else if (userMessage.contains("fee") || userMessage.contains("cost")) {
            return "Program fees vary depending on the learning path. Our team shares complete details during the enrollment discussion.";
        }

        // Default
        else {
            return "I’m here to help you understand Iron Lady’s programs, services, and enrollment process. What would you like to know?";
        }
    }
}


