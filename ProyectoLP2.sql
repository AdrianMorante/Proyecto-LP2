drop database ProyectoLP2;
create database ProyectoLP2;
use ProyectoLP2;

INSERT INTO Alumno (nombre, apellido, carrera, telefono)
VALUES ('Juan', 'Pérez', 'Ingeniería Informática', '1234567890'),
       ('María', 'González', 'Ciencias Económicas', '9876543210'),
       ('Carlos', 'López', 'Medicina', '5551237890'),
       ('Laura', 'Martínez', 'Derecho', '3339998888'),
       ('Pedro', 'Sánchez', 'Arquitectura', '7778889999'),
       ('Ana', 'Rodríguez', 'Biología', '6665554444'),
       ('José', 'Hernández', 'Psicología', '2223334444'),
       ('Sofía', 'López', 'Ciencias de la Comunicación', '1112223333'),
       ('Jorge', 'Gómez', 'Educación Física', '9998887777'),
       ('Marcela', 'Flores', 'Química', '4445556666');

INSERT INTO Aula (tipo_aula, hora_inicio, hora_fin, estado)
VALUES ('Laboratorio', '08:00:00', '10:00:00', 'Disponible'),
       ('Aula Magna', '14:00:00', '16:00:00', 'Ocupado'),
       ('Sala de Conferencias', '09:00:00', '11:00:00', 'Disponible'),
       ('Salón de Actos', '15:00:00', '17:00:00', 'Disponible'),
       ('Aula de Informática', '10:00:00', '12:00:00', 'Ocupado'),
       ('Aula de Idiomas', '13:00:00', '15:00:00', 'Disponible'),
       ('Sala de Estudio', '08:30:00', '10:30:00', 'Disponible'),
       ('Sala de Arte', '16:00:00', '18:00:00', 'Ocupado'),
       ('Aula de Música', '12:00:00', '14:00:00', 'Disponible'),
       ('Aula de Ciencias', '11:00:00', '13:00:00', 'Ocupado');

INSERT INTO Reserva (alumno_id, aula_id, inicio_reserva, fin_reserva)
VALUES (1, 1, '08:00:00', '10:00:00'),
       (2, 2, '14:00:00', '16:00:00'),
       (3, 3, '09:00:00', '11:00:00'),
       (4, 4, '15:00:00', '17:00:00'),
       (5, 5, '10:00:00', '12:00:00'),
       (6, 6, '13:00:00', '15:00:00'),
       (7, 7, '08:30:00', '10:30:00'),
       (8, 8, '16:00:00', '18:00:00'),
       (9, 9, '12:00:00', '14:00:00'),
       (10, 10, '11:00:00', '13:00:00');