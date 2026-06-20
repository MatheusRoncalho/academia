CREATE TABLE aluno (
                        id BIGSERIAL PRIMARY KEY,
                        nome VARCHAR(100) NOT NULL,
                        cpf VARCHAR(14) NOT NULL UNIQUE,
                        telefone VARCHAR(20),
                        email VARCHAR(100),
                        data_nascimento DATE,
                         data_cadastro DATE NOT NULL,
                        status VARCHAR(20) NOT NULL CHECK (status IN ('ATIVO', 'INATIVO', 'SUSPENSO')),
                        criado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                        atualizado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE especialidade (
                        id BIGSERIAL PRIMARY KEY,
                        nome VARCHAR(100) NOT NULL UNIQUE,
                        descricao VARCHAR(255),
                        criado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                        atualizado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE profissional (
                        id BIGSERIAL PRIMARY KEY,
                        especialidade_id BIGINT NOT NULL REFERENCES especialidade(id),
                        nome VARCHAR(100) NOT NULL,
                        cpf VARCHAR(14) UNIQUE,
                        telefone VARCHAR(20),
                        email VARCHAR(100),
                        registro_profissional VARCHAR(50),
                        ativo BOOLEAN NOT NULL DEFAULT TRUE,
                        criado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                        atualizado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE servico (
                        id BIGSERIAL PRIMARY KEY,
                        nome VARCHAR(100) NOT NULL UNIQUE,
                        descricao VARCHAR(255),
                        ativo BOOLEAN NOT NULL DEFAULT TRUE,
                        criado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                        atualizado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE plano (
                        id BIGSERIAL PRIMARY KEY,
                        nome VARCHAR(100) NOT NULL,
                        descricao VARCHAR(255),
                        duracao_meses INTEGER NOT NULL CHECK (duracao_meses > 0),
                        valor DECIMAL(10,2) NOT NULL CHECK (valor > 0),
                        ativo BOOLEAN NOT NULL DEFAULT TRUE,
                        criado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                        atualizado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE plano_servico (
                        id BIGSERIAL PRIMARY KEY,
                        plano_id BIGINT NOT NULL REFERENCES plano(id),
                        servico_id BIGINT NOT NULL REFERENCES servico(id),
                        UNIQUE (plano_id, servico_id)
);

CREATE TABLE contrato_plano (
                        id BIGSERIAL PRIMARY KEY,
                        aluno_id BIGINT NOT NULL REFERENCES aluno(id),
                        plano_id BIGINT NOT NULL REFERENCES plano(id),
                        data_inicio DATE NOT NULL,
                        data_fim DATE NOT NULL,
                        status VARCHAR(20) NOT NULL CHECK (status IN ('ATIVO', 'ENCERRADO', 'CANCELADO')),
                        criado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                        atualizado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                        CHECK (data_fim >= data_inicio)
);

CREATE TABLE pagamento (
                        id BIGSERIAL PRIMARY KEY,
                        contrato_plano_id BIGINT NOT NULL REFERENCES contrato_plano(id),
                        valor DECIMAL(10,2) NOT NULL CHECK (valor > 0),
                        data_pagamento DATE,
                        forma_pagamento VARCHAR(20) NOT NULL CHECK (forma_pagamento IN ('PIX','CARTAO_CREDITO','CARTAO_DEBITO','DINHEIRO','BOLETO')),
                        status VARCHAR(20) NOT NULL CHECK (status IN ('PENDENTE','PAGO','CANCELADO')),
                        referencia VARCHAR(20),
                        criado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                        atualizado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE acompanhamento (
                        id BIGSERIAL PRIMARY KEY,
                        aluno_id BIGINT NOT NULL REFERENCES aluno(id),
                        profissional_id BIGINT NOT NULL REFERENCES profissional(id),
                        servico_id BIGINT NOT NULL REFERENCES servico(id),
                        data_atendimento DATE NOT NULL,
                        observacoes TEXT,
                        proximo_retorno DATE,
                        criado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                        atualizado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                        CHECK (proximo_retorno IS NULL OR proximo_retorno >= data_atendimento)
);
