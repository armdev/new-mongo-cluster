package io.project.app.people.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 *
 * @author armen
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
@Document(collection = "people")
public class People implements Serializable {

    @Serial
    private static final long serialVersionUID = 2802239397011680470L;

    @Id
    private String id;

    @Field
    private String firstname;

    @Field
    private String lastname;

    @Field
    private String email;
    
    @Field
    private LocalDateTime registerDate;

}
