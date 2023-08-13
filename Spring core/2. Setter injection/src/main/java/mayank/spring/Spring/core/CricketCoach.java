package mayank.spring.Spring.core;


import org.springframework.stereotype.Component;

@Component // it marks the class as spring bean
public class CricketCoach implements coach{
    @Override
    public String getDailyWorkout() {
        return "Practice cardio for 60 mins ";
    }
}
