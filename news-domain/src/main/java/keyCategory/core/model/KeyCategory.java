package keyCategory.core.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name="key_category")
public class KeyCategory {

    @Id
    private UUID id;
    private String key;
}
