package co.develhope.Angelo.Notification.mail.Example.api.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationDTO {

    /** User send data */
    private String userId;
    /** Title of the notification */
    private String title;
    /** TExt of the notification */
    private String text;
}
