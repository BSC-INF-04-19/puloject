package gilbertkamoto.embi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class HouseService {

    private final HouseRepository houseRepository;

    @Autowired
    public HouseService(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    public List<House> getHouses() {
       return houseRepository.findAll();


    }

    public void addNewHouse(House house) {
        Optional<House> houseOptional=houseRepository.findHouseByEmail(house.getEmail());
        if (houseOptional.isPresent()) {
            throw new IllegalStateException("email taken");
        }
        houseRepository.save(house);
    }
    public void deleteHouse(Long id){
        Long houseId = null;
        boolean exists=houseRepository.existsById(houseId);
        if (exists){
            throw new IllegalStateException("house with id " + houseId + " does not exists");
        }
        houseRepository.deleteById(houseId);
    }


    public void updateHouse(Long houseId, String name, String email) {
    }
}

