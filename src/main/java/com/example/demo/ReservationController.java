package com.example.demo;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {

    @PostMapping
    public ResponseEntity<String> createReservation() throws InterruptedException {
        // 2PC의 동기식 병목 시뮬레이션: 응답이 올 때까지 50ms 대기 (Blocking)
        Thread.sleep(50); 
        return ResponseEntity.ok("2PC Reservation Success");
    }
}
