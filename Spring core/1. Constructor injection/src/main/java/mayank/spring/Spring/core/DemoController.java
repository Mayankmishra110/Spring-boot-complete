package mayank.spring.Spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private coach myCoach;

    //Defining a constructor for dependency injection
    @Autowired
    public DemoController(coach theCoach){
        myCoach =theCoach;
    }

    @GetMapping("/dailyworkout")

    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
