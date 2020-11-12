CREATE TABLE IF NOT EXISTS tasks (
    id VARCHAR(250) NOT NULL,
    description VARCHAR(250) NOT NULL,
    is_complete BOOLEAN DEFAULT false,
    todo_lists_id VARCHAR ,
    PRIMARY KEY(id),
    FOREIGN KEY(todo_lists_id) REFERENCES todo_lists(id)
)

CREATE TABLE IF NOT EXISTS todo_lists (
    id VARCHAR(250) NOT NULL,
    title VARCHAR(250) NOT NULL,
    PRIMARY KEY(id)
)
