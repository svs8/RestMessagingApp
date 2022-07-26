package com.bridgelabz.hellomessaging.Controller;


import com.bridgelabz.hellomessaging.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping(value={"","/"})
    public String sayHello(){
        return "Hello Java";
    }

    @RequestMapping(value={"/helloeve"},method = RequestMethod.GET)
    public String sayHelloUniqely(){
        return "Hello Everyone to the world of Java";
    }

    @RequestMapping(value={"/query"},method = RequestMethod.GET)
    public String sayHello(@RequestParam(value= "name") String name){
        return "Hello"+ name;
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name){
        return "Hello"+"Mr."+ name+ "!!!";
    }
    @PostMapping("/post")
    public String sayHello(@RequestBody User user){
        return "Hello"+user.getFirstName()+" " +user.getLastName()+"!!!";
    }
    @PutMapping("/put/{firstName}")
    public  String sayHello(@PathVariable String firstName,@RequestParam(value="lastname")String lastName){
        return "Hello" + firstName + " "+ lastName + "!!!!";
    }
}
