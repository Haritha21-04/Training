use supply;

INSERT INTO Suppliers (sid, SName, Address)
VALUES
    (1, 'Acme widget Suppliers', '123 Main St'),
    (2, 'Supplier 2', '456 Elm St'),
    (3, 'Supplier 3', '789 Oak St');

INSERT INTO Parts (pid, pname, color)
VALUES
    (101, 'Part 1', 'Red'),
    (102, 'Part 2', 'Blue'),
    (103, 'Part 3', 'Green');

INSERT INTO PartsSupplied (sid, pid, cost)
VALUES
    (1, 101, 10.99),
    (1, 102, 12.49),
    (2, 101, 11.99),
    (2, 103, 9.99),
    (3, 102, 13.99);
    
