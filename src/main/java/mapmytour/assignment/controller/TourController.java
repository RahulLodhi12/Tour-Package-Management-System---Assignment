package mapmytour.assignment.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import mapmytour.assignment.bean.Tour;
import mapmytour.assignment.repository.TourRepo;
import mapmytour.assignment.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
@Tag(name="Tour Package API - by Rahul")
public class TourController {

    @Autowired
    TourService tourService;

    @Operation(summary = "Welcome Message..!")
    @GetMapping("/")
    public String welcomeMsg(){
        return "welcome to tour package management system";
    }

    @Operation(summary = "Get All Tour Packages")
    @GetMapping("/tours")
    public List<Tour> getAllPackages(){
        return tourService.getAllPackages();
    }

    @Operation(summary = "Add a Tour Package")
    @PostMapping("/tours")
    public void addPackage(@RequestParam String image, @RequestParam String discountInPercentage, @RequestParam String title, @RequestParam String description, @RequestParam String duration, @RequestParam String actualPrice, @RequestParam String discountedPrice){
        tourService.addPackage(image,discountInPercentage,title,description,duration,actualPrice,discountedPrice);
    }

    @Operation(summary = "Get Tour Package Details By Id")
    @GetMapping("/tours/{id}")
    public Optional<Tour> getTourById(@PathVariable Long id){
        return tourService.getTourById(id);
    }

    @Operation(summary = "Search Tour Details by Location")
    @GetMapping("/tours/search")
    public List<Tour> getTourByLocation(@RequestParam String location){
        return tourService.getTourByLocation(location);
    }
}
