-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 03-Jul-2022 às 02:17
-- Versão do servidor: 10.4.21-MariaDB
-- versão do PHP: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `enfermagem`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `artigo`
--

CREATE TABLE `artigo` (
  `idArtigo` int(11) NOT NULL,
  `nomeArtigo` varchar(30) DEFAULT NULL,
  `artigoAutor` varchar(50) DEFAULT NULL,
  `dataArtigo` datetime DEFAULT current_timestamp(),
  `tipoArtigo` varchar(50) DEFAULT NULL,
  `idProfissionalsaude` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `paciente`
--

CREATE TABLE `paciente` (
  `idPaciente` int(11) NOT NULL,
  `nomePaciente` varchar(100) NOT NULL,
  `idade` varchar(100) NOT NULL,
  `peso` varchar(100) NOT NULL,
  `altura` varchar(100) NOT NULL,
  `emailPaciente` varchar(100) NOT NULL,
  `senha` varchar(20) NOT NULL,
  `telefonePaciente` varchar(30) DEFAULT NULL,
  `enderecoPaciente` varchar(90) DEFAULT NULL,
  `IdenUnica` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `profissionaldasaude`
--

CREATE TABLE `profissionaldasaude` (
  `idProfissionalSaude` int(11) NOT NULL,
  `nomeProfissionalSaude` varchar(100) DEFAULT NULL,
  `emailProfissionalSaude` varchar(100) NOT NULL,
  `senhaProfissionalSaude` varchar(30) NOT NULL,
  `descriçãoProfissionalSaude` varchar(200) DEFAULT NULL,
  `enderecoProfissionalSaude` varchar(90) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `artigo`
--
ALTER TABLE `artigo`
  ADD PRIMARY KEY (`idArtigo`),
  ADD UNIQUE KEY `nomeArtigo` (`nomeArtigo`),
  ADD KEY `idProfissionalsaude` (`idProfissionalsaude`);

--
-- Índices para tabela `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`idPaciente`);

--
-- Índices para tabela `profissionaldasaude`
--
ALTER TABLE `profissionaldasaude`
  ADD PRIMARY KEY (`idProfissionalSaude`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `artigo`
--
ALTER TABLE `artigo`
  MODIFY `idArtigo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `paciente`
--
ALTER TABLE `paciente`
  MODIFY `idPaciente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=475;

--
-- AUTO_INCREMENT de tabela `profissionaldasaude`
--
ALTER TABLE `profissionaldasaude`
  MODIFY `idProfissionalSaude` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `artigo`
--
ALTER TABLE `artigo`
  ADD CONSTRAINT `artigo_ibfk_1` FOREIGN KEY (`idProfissionalsaude`) REFERENCES `profissionaldasaude` (`idProfissionalSaude`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
