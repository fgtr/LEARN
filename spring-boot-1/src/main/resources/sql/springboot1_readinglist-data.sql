INSERT INTO read_item (id, reader, isbn, title, author, description)
  VALUES (1, 'jeff', '9781617292545', 'Spring Boot in Action', 'Craig Walls', 'A developer-focused guide to writing applications using Spring Boot. You''ll learn how to bypass the tedious configuration steps so that you can concentrate on your application''s behavior.');
INSERT INTO read_item (id, reader, isbn, title, author, description)
  VALUES (2, 'jeff', '9781617294945', 'Spring in Action, Fifth Edition', 'Craig Walls', 'Spring in Action, 5th Edition is the fully-updated revision of Manning''s bestselling Spring in Action. This new edition includes all Spring 5.0 updates, along with new examples on reactive programming, Spring WebFlux, and microservices. You''ll also find the latest Spring best practices, including Spring Boot for application setup and configuration.');
INSERT INTO read_item (id, reader, isbn, title, author, description)
  VALUES (3, 'jeff', '9781617291999', 'Java 8 in Action (Lambdas, streams, and functional-style programming)', 'Raoul-Gabriel Urma, Mario Fusco, and Alan Mycroft', 'Java 8 in Action is a clearly written guide to the new features of Java 8. The book covers lambdas, streams, and functional-style programming. With Java 8''s functional features you can now write more concise code in less time, and also automatically benefit from multicore architectures. It''s time to dig in!');
INSERT INTO read_item (id, reader, isbn, title, author, description)
  VALUES (4, 'jeff', '9781617292736', 'Functional Programming in Java (How functional techniques improve your Java programs)', 'Pierre-Yves Saumont', 'Functional Programming in Java teaches Java developers how to incorporate the most powerful benefits of functional programming into new and existing Java code. You''ll learn to think functionally about coding tasks in Java and use FP to make your applications easier to understand, optimize, maintain, and scale.');

INSERT INTO reader (username, password, fullname) VALUES ('craig', 'password', 'Craig Walls');
INSERT INTO reader (username, password, fullname) VALUES ('walt', 'marceline', 'Walt Disney');
INSERT INTO reader (username, password, fullname) VALUES ('jeff', 'password', 'Jeff King');
