package com.surveillance.disease.config;

import com.surveillance.disease.entity.District;
import com.surveillance.disease.entity.User;
import com.surveillance.disease.repository.DistrictRepository;
import com.surveillance.disease.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataSeeder implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DistrictRepository districtRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        if (userRepository.count() == 0) {
            User admin = User.builder()
                    .username("admin")
                    .password(passwordEncoder.encode("admin"))
                    .email("admin@surveillance.com")
                    .role("ROLE_ADMIN")
                    .build();
            userRepository.save(admin);

            User officer = User.builder()
                    .username("editor")
                    .password(passwordEncoder.encode("editor"))
                    .email("editor@surveillance.com")
                    .role("ROLE_EDITOR")
                    .build();
            userRepository.save(officer);
        }

        List<District> districts = districtRepository.findAll();
        if (districts.isEmpty()) {
            District d1 = District.builder().name("North District").population(500000).riskLevel("LOW").latitude(34.0522).longitude(-118.2437).build();
            District d2 = District.builder().name("South District").population(750000).riskLevel("MODERATE").latitude(33.7490).longitude(-84.3880).build();
            District d3 = District.builder().name("Central District").population(1200000).riskLevel("HIGH").latitude(41.8781).longitude(-87.6298).build();
            
            districtRepository.saveAll(Arrays.asList(d1, d2, d3));
        } else {
            for (District d : districts) {
                if (d.getLatitude() == null || d.getLongitude() == null) {
                    if (d.getName().equals("North District")) { d.setLatitude(34.0522); d.setLongitude(-118.2437); }
                    else if (d.getName().equals("South District")) { d.setLatitude(33.7490); d.setLongitude(-84.3880); }
                    else if (d.getName().equals("Central District")) { d.setLatitude(41.8781); d.setLongitude(-87.6298); }
                    else { d.setLatitude(0.0); d.setLongitude(0.0); }
                    districtRepository.save(d);
                }
            }
        }
    }
}
