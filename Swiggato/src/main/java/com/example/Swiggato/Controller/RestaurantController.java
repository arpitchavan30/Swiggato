package com.example.Swiggato.Controller;

import com.example.Swiggato.DTO.RequestDTO.FoodRequest;
import com.example.Swiggato.DTO.RequestDTO.MenuRequest;
import com.example.Swiggato.DTO.RequestDTO.RestaurantRequest;
import com.example.Swiggato.DTO.ResponseDTO.RestaurantResponse;
import com.example.Swiggato.Service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Restaurant")
public class RestaurantController {

    // by using Constructor injection
    final RestaurantService restaurantService;
    @Autowired
    public RestaurantController(RestaurantService restaurantService){
        this.restaurantService=restaurantService;
    }

    @PostMapping("/add")
    public ResponseEntity addRestaurant(@RequestBody RestaurantRequest restaurantRequest){
        RestaurantResponse restaurantResponse = restaurantService.addRestaurant(restaurantRequest);
        return new ResponseEntity(restaurantResponse, HttpStatus.CREATED);
    }
    @PutMapping("/update/status")
    public ResponseEntity changeStatus(@RequestParam int id){
        try{
            String message = restaurantService.changeStatus(id);
            return new ResponseEntity(message,HttpStatus.ACCEPTED);
        }
        catch (Exception e){
            return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/add/menu")
    public ResponseEntity addMenuItemToRestaurant(@RequestBody MenuRequest menuRequest){
        try{
            RestaurantResponse restaurantResponse = restaurantService.addMenuItemToRestaurant(menuRequest);
            return new ResponseEntity(restaurantResponse, HttpStatus.CREATED);
        }
        catch (Exception e){
            return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }
}
