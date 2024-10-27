create table board (
    board_no bigint not null primary key comment 'index',
    board_title varchar(255) not null comment '제목',
    content TEXT not null comment '내용',
    created_at timestamp default current_timestamp comment '생성일',
    updated_at timestamp default current_timestamp on update current_timestamp comment '수정일'
);