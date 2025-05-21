-- Inserts for Persona
INSERT INTO PERSONA(id_persona, ci, nombre, apellido, email, telefono, direccion, fecha_nacimiento) VALUES
  (1, 7776668, 'Nombre1', 'Apellido1', 'nombre1.apellido1@umsa.bo', '+591 77822394', 'Calle Falsa #46, Zona Obrajes, La Paz', '1980-09-10'),
  (2, 8825187, 'Nombre2', 'Apellido2', 'nombre2.apellido2@umsa.bo', '+591 78601312', 'Calle Falsa #74, Zona Cotahuma, La Paz', '2003-04-03'),
  (3, 4627211, 'Nombre3', 'Apellido3', 'nombre3.apellido3@umsa.bo', '+591 74978932', 'Calle Falsa #132, Zona Cotahuma, La Paz', '1963-03-17'),
  (4, 2110364, 'Nombre4', 'Apellido4', 'nombre4.apellido4@umsa.bo', '+591 74353750', 'Calle Falsa #237, Zona Sur, La Paz', '1965-02-21'),
  (5, 3472010, 'Nombre5', 'Apellido5', 'nombre5.apellido5@umsa.bo', '+591 73564234', 'Calle Falsa #187, Zona Obrajes, La Paz', '1969-11-02'),
  (6, 6214026, 'Nombre6', 'Apellido6', 'nombre6.apellido6@umsa.bo', '+591 76564168', 'Calle Falsa #240, Zona Obrajes, La Paz', '1984-12-26'),
  (7, 4091000, 'Nombre7', 'Apellido7', 'nombre7.apellido7@umsa.bo', '+591 77183728', 'Calle Falsa #272, Zona Cotahuma, La Paz', '1995-03-10'),
  (8, 5295604, 'Nombre8', 'Apellido8', 'nombre8.apellido8@umsa.bo', '+591 75787961', 'Calle Falsa #259, Zona Cotahuma, La Paz', '1995-07-30'),
  (9, 5501876, 'Nombre9', 'Apellido9', 'nombre9.apellido9@umsa.bo', '+591 74851240', 'Calle Falsa #74, Zona Sur, La Paz', '2004-10-01'),
  (10, 9714887, 'Nombre10', 'Apellido10', 'nombre10.apellido10@umsa.bo', '+591 75431504', 'Calle Falsa #40, Zona Cotahuma, La Paz', '1966-09-11');

-- Inserts for ESTUDIANTE
INSERT INTO ESTUDIANTE(id_persona, matricula, carrera, activo) VALUES
  (7, 'MAT2311', 'Ingeniería', 0),
  (5, 'MAT8891', 'Medicina', 0),
  (10, 'MAT3664', 'Administración', 0),
  (4, 'MAT6863', 'Administración', 0),
  (1, 'MAT5986', 'Derecho', 0),
  (3, 'MAT9675', 'Medicina', 1),
  (9, 'MAT5341', 'Derecho', 0);

-- Inserts for DOCENTE
INSERT INTO DOCENTE(id_persona, titulo_academico) VALUES
  (1, 'Magíster'),
  (3, 'Doctor');

-- Inserts for ROL
INSERT INTO ROL(id, nombre) VALUES
  (1, 'admin'),
  (2, 'estudiante'),
  (3, 'docente'),
  (4, 'invitado');

-- Inserts for USUARIO
INSERT INTO USUARIO(id, username, password, id_persona, rol_id) VALUES
  (1, 'user1', 'pwd1', 1, 3),
  (2, 'user2', 'pwd2', 2, 1),
  (3, 'user3', 'pwd3', 3, 1),
  (4, 'user4', 'pwd4', 4, 4),
  (5, 'user5', 'pwd5', 5, 4),
  (6, 'user6', 'pwd6', 6, 3),
  (7, 'user7', 'pwd7', 7, 2),
  (8, 'user8', 'pwd8', 8, 3),
  (9, 'user9', 'pwd9', 9, 4),
  (10, 'user10', 'pwd10', 10, 4);

-- Inserts for MATERIA
INSERT INTO MATERIA(id_materia, nombre, descripcion, area, activa) VALUES
  (1, 'Materia1', 'Descripcion de Materia1', 'Artes', 1),
  (2, 'Materia2', 'Descripcion de Materia2', 'Letras', 0),
  (3, 'Materia3', 'Descripcion de Materia3', 'Ciencias', 1),
  (4, 'Materia4', 'Descripcion de Materia4', 'Artes', 0),
  (5, 'Materia5', 'Descripcion de Materia5', 'Ciencias', 0);

-- Inserts for MENCION
INSERT INTO MENCION(id_mencion, nombre, descripcion) VALUES
  (1, 'Mención1', 'Descripción mención1'),
  (2, 'Mención2', 'Descripción mención2'),
  (3, 'Mención3', 'Descripción mención3');

-- Inserts for MATERIA_MENCION
INSERT INTO MATERIA_MENCION(id_materia, id_mencion, sigla, semestre) VALUES
  (2, 1, 'SIG21', 3),
  (3, 3, 'SIG33', 4),
  (3, 1, 'SIG31', 10),
  (3, 1, 'SIG31', 5),
  (4, 3, 'SIG43', 6),
  (1, 3, 'SIG13', 7);

-- Inserts for PARALELO
INSERT INTO PARALELO(id_paralelo, grupo, horario, dias, aula, id_materia, id_docente) VALUES
  (1, 'G2', '11:00 - 12:00', 'LUN,MIE,VIE', 'A120', 2, 3),
  (2, 'G2', '11:00 - 20:00', 'MAR,JUE', 'A113', 3, 1),
  (3, 'G1', '9:00 - 16:00', 'LUN,MAR,MIER', 'A108', 5, 3),
  (4, 'G2', '10:00 - 18:00', 'LUN,MAR,MIER', 'A115', 5, 3),
  (5, 'G2', '12:00 - 13:00', 'LUN,MAR,MIER', 'A112', 3, 1),
  (6, 'G4', '12:00 - 17:00', 'MAR,JUE', 'A109', 3, 3);

-- Inserts for INSCRIPCION
INSERT INTO INSCRIPCION(id_inscripcion, id_estudiante, id_paralelo, fecha_inscripcion, estado, nota_final, activo) VALUES
  (1, 4, 6, '2025-01-24', 'RETIRADO', 91.06, 0),
  (2, 10, 5, '2025-01-17', 'RETIRADO', 64.05, 0),
  (3, 4, 5, '2025-05-28', 'INSCRITO', 51.93, 1),
  (4, 5, 6, '2025-04-07', 'APROBADO', 94.82, 0),
  (5, 5, 4, '2025-03-01', 'INSCRITO', 79.31, 0),
  (6, 3, 2, '2025-03-16', 'APROBADO', 78.06, 0),
  (7, 7, 4, '2025-03-06', 'INSCRITO', 92.51, 0),
  (8, 7, 6, '2025-01-20', 'INSCRITO', 72.2, 1),
  (9, 5, 6, '2025-01-27', 'INSCRITO', 85.54, 0),
  (10, 9, 3, '2025-03-23', 'RETIRADO', 87.73, 0),
  (11, 1, 1, '2025-01-28', 'INSCRITO', 89.55, 1),
  (12, 7, 6, '2025-04-21', 'APROBADO', 56.73, 0),
  (13, 9, 5, '2025-05-06', 'APROBADO', 79.45, 1),
  (14, 9, 5, '2025-05-05', 'APROBADO', 90.69, 0);

-- Inserts for EVALUACION
INSERT INTO EVALUACION(id_evaluacion, id_paralelo, nombre, porcentaje, sobre) VALUES
  (1, 1, 'Eval1', 40, 100),
  (2, 4, 'Eval2', 10, 100),
  (3, 5, 'Eval3', 20, 100),
  (4, 2, 'Eval4', 10, 100),
  (5, 4, 'Eval5', 20, 100),
  (6, 2, 'Eval6', 20, 100),
  (7, 1, 'Eval7', 20, 100),
  (8, 6, 'Eval8', 10, 100),
  (9, 2, 'Eval9', 50, 100),
  (10, 2, 'Eval10', 50, 100);

-- Inserts for NOTA
INSERT INTO NOTA(id_nota, id_evaluacion, id_inscripcion, nota) VALUES
  (1, 1, 1, 65.82),
  (2, 1, 5, 4.74),
  (3, 1, 3, 83.17),
  (4, 2, 14, 89.22),
  (5, 2, 5, 24.4),
  (6, 2, 9, 80.02),
  (7, 3, 5, 63.01),
  (8, 3, 4, 97.87),
  (9, 3, 6, 20.14),
  (10, 4, 14, 17.85),
  (11, 4, 3, 64.17),
  (12, 4, 5, 86.51),
  (13, 5, 2, 16.1),
  (14, 5, 5, 8.63),
  (15, 5, 4, 61.83),
  (16, 6, 11, 74.4),
  (17, 6, 12, 5.18),
  (18, 6, 5, 59.96),
  (19, 7, 14, 36.6),
  (20, 7, 2, 14.02),
  (21, 7, 8, 84.0),
  (22, 8, 4, 30.1),
  (23, 8, 14, 21.14),
  (24, 8, 3, 6.14),
  (25, 9, 7, 65.9),
  (26, 9, 11, 51.68),
  (27, 9, 3, 46.66),
  (28, 10, 3, 3.06),
  (29, 10, 10, 50.01),
  (30, 10, 11, 98.26);