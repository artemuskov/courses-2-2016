USE hibernate;

CREATE TABLE client (
  id INTEGER PRIMARY KEY AUTO_INCREMENT,
  first_name VARCHAR(128) NOT NULL,
  last_name VARCHAR(128) NOT NULL,
  inn VARCHAR(128) NOT NULL
);

CREATE TABLE accounts (
  id INTEGER PRIMARY KEY AUTO_INCREMENT,
  account_number VARCHAR(128) NOT NULL,
  client_id INTEGER NOT NULL,
  balance FLOAT NOT NULL,
  FOREIGN KEY (client_id) REFERENCES client (id)
);

CREATE TABLE transactions (
  id    INTEGER PRIMARY KEY AUTO_INCREMENT,
  sender_account INTEGER NOT NULL,
  reciever_account INTEGER NOT NULL,
  sum_transation FLOAT NOT NULL,
  FOREIGN KEY (sender_account) REFERENCES accounts (id),
  FOREIGN KEY (reciever_account) REFERENCES accounts (id)
);



