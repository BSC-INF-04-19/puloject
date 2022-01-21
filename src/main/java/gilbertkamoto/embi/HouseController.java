package gilbertkamoto.embi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/House")
public class HouseController {

    private final HouseService houseService;

    @Autowired
    public HouseController(HouseService houseService) {
        this.houseService = houseService;
    }

    @GetMapping
    public List<House> getHouses(){
        return houseService.getHouses();
    }
    @PostMapping
 public void registerNewHouse(@RequestBody House house){
        houseService.addNewHouse(house);
 }
 @DeleteMapping(path="{houseId")
    public void deleteStudent(@PathVariable("houseId") Long houseid){
        houseService.deleteHouse(houseid);

     }
     @PutMapping(path="{houseId}")
    public void UpdateHouse(
            @PathVariable("houseId") Long houseId,
            @RequestParam(required=false) String name,
            @RequestParam(required= false) String email){
        houseService.updateHouse(houseId, name, email);
     }

 }

