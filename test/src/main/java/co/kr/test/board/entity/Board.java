package co.kr.test.board.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Board {
    @Id
    private Long id;
    private String boardTitle;
    private String content;
    private Date createAt;
    private Date updateAt;
}
