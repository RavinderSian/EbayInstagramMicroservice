import java.time.ZonedDateTime;

@Data
public class Listing {
    
    private Long id;
    private ZonedDateTime listingDate;
    private Double cost;
    private Boolean offer;
    private Boolean active;
    private Boolean ended;
    private Boolean sold;
    private String Url;
    private Boolean Unsold;


}
