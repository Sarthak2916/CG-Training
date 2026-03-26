package com.training.calc;


import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String  returnHello(){
        return "Hello ji";
    }

    @GetMapping("/bye")
    public String returnBye(){
        return "Bye Bye";
    }

    @GetMapping("/search")
    public String search(@RequestParam(name="c") String q){// variable name and ?_ should be same otherwise use (name=)
        if(q.equalsIgnoreCase("Hikari")) return "beautiful";
        return "🤮";
    }

    @GetMapping("/add/{x}/{y}")
    public String add(@PathVariable(name="y") int a, @PathVariable int y){ // variable names in method and GetMapping should be same or use name=
        return ""+(a+y);
    }

    @GetMapping("/sub/{x}/{y}")
    public String sub(@PathVariable int x, @PathVariable int y){
        return ""+(x-y);
    }

    @GetMapping("/mul/{x}/{y}")
    public String mul(@PathVariable int x, @PathVariable int y){
        return ""+(x*y);
    }

    @GetMapping("/div/{x}/{y}")
    public String div(@PathVariable int x, @PathVariable int y){
        return ""+(x/y);
    }

    @PostMapping("/input")
    public Student input(@RequestBody Student x){
//        System.out.println(x);
        return x;
    }

}
