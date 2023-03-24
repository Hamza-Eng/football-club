package akaza.gdt.com.entity;

import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Column;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Data;
@Data
public class Seance {
	
	public enum Time {_8_9,_9_10};

	 @CreatedDate
	    @Column(name = "created_at", nullable = false, updatable = false)
	    private Date createdAt;

	    @LastModifiedDate
	    @Column(name = "updated_at")
	    private LocalDateTime updatedAt;
}
