package mapmytour.assignment.service;

import io.swagger.v3.oas.annotations.Operation;
import mapmytour.assignment.bean.Tour;
import mapmytour.assignment.repository.TourRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class TourService {
    @Autowired
    TourRepo tourRepo;

    public String welcomeMsg(){
        return "welcome to tour package management system";
    }


    public List<Tour> getAllPackages(){
        return tourRepo.findAll();
    }


    public void addPackage(String image, String discountInPercentage, String title, String description, String duration, String actualPrice, String discountedPrice){
        tourRepo.save(new Tour(image,discountInPercentage,title,description,duration,actualPrice,discountedPrice));
    }


    public Optional<Tour> getTourById(Long id){
        return tourRepo.findById(id);
    }


    public List<Tour> getTourByLocation(String location){
        return tourRepo.findByTitleContainingIgnoreCase(location);
    }
}
