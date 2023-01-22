package com.prajwal.FirstDemoSpringFramework;

import com.prajwal.FirstDemoSpringFramework.flow.web.Controller;
import com.prajwal.FirstDemoSpringFramework.game.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class FirstDemoSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(FirstDemoSpringFrameworkApplication.class, args);
//		MarioGame game=new MarioGame();
//		SuperContraGame game=new SuperContraGame();

//		PackmanGame game=new PackmanGame();


//		GamingConsole game=new MarioGame();
//		GameRunner runner=new GameRunner(game);

		GameRunner runner=context.getBean(GameRunner.class);
		runner.run();

		Controller controller=context.getBean(Controller.class);
		System.out.println(controller.displaySum());
	}

}
