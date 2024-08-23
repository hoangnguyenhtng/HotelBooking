package hotel.hotelbooking.entity;

import jakarta.persistence.*;
import lombok.*;
import org.joda.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate checkInDate;

    private LocalDate checkOutDate;

    private int numAdult;

    private int numChild;

    private double totalBill;

    private boolean paymentStatus;

    private String bookingConfirmationCode;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id")
    private Room room;

}
