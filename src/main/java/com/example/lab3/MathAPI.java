package com.example.lab3;

import org.springframework.web.bind.annotation.*;

@RestController
public class MathAPI {

    @RequestMapping( value = "/plus/{n1}/{n2}", method = RequestMethod.GET)
    public Double Myplus(@PathVariable("n1") double n1, @PathVariable("n2") double n2){
        return n1 + n2;
    }

    @RequestMapping( value = "/minus/{n1}/{n2}", method = RequestMethod.GET)
    public Double Myminus(@PathVariable("n1") double n1, @PathVariable("n2") double n2){
        return n1 - n2;
    }

    @RequestMapping( value = "/divide/{n1}/{n2}", method = RequestMethod.GET)
    public Double myDivide(@PathVariable("n1") double n1, @PathVariable("n2") double n2){
        return n1 / n2;
    }

    @RequestMapping( value = "/multi/{n1}/{n2}", method = RequestMethod.GET)
    public Double myMulti(@PathVariable("n1") double n1, @PathVariable("n2") double n2){
        return n1 * n2;
    }

    @RequestMapping( value = "/mod/{n1}/{n2}", method = RequestMethod.GET)
    public Double myMod(@PathVariable("n1") double n1, @PathVariable("n2") double n2){
        return n1 % n2;
    }
    @RequestMapping( value = "/max", method = RequestMethod.POST)
    public Double myMax(@RequestParam("n1") double n1, @RequestParam("n2") double n2){
        if (n1 >= n2){
            return n1;
        }
        else {
            return  n2;
        }
    }

}
