USE [primeiraappjdbc]
GO
/****** Object:  Table [dbo].[usuarios]    Script Date: 11/05/2017 09:47:03 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[usuarios](
	[id] [int] IDENTITY(1,1) NOT FOR REPLICATION NOT NULL,
	[nome] [varchar](50) NULL,
	[senha] [varchar](50) NULL,
	[email] [varchar](50) NULL
) ON [PRIMARY]

GO
