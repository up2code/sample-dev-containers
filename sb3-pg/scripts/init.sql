-- Create the "books" table
CREATE TABLE books (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255),
    author VARCHAR(255)
);

-- Insert sample data into the "books" table
INSERT INTO books (title, author) VALUES
    ('Book 1', 'Author 1'),
    ('Book 2', 'Author 2'),
    ('Book 3', 'Author 3'),
    ('Book 4', 'Author 4');
