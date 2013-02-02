package hotel;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class Hotel {
	private String name;
	private String address;
	private String manager;
	private String phone;

}
