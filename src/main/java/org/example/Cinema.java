package org.example;

import lombok.*;

import java.util.List;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Cinema {
    private CinemaService cinemaService;
    private List<CinemaService> cinemaServices;

    public Cinema(CinemaService cinemaService) {
        this.cinemaService = cinemaService;
    }

    public void setCinemaServices(List<CinemaService> cinemaServices) {
        this.cinemaServices = cinemaServices;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "cinemaService=" + cinemaService +
                ", cinemaServices=" + cinemaServices +
                '}';
    }
}
