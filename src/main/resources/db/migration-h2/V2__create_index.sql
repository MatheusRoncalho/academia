CREATE INDEX idx_aluno_cpf ON aluno(cpf);

CREATE INDEX idx_profissional_cpf ON profissional(cpf);

CREATE INDEX idx_contrato_aluno ON contrato_plano(aluno_id);

CREATE INDEX idx_contrato_plano ON contrato_plano(plano_id);

CREATE INDEX idx_pagamento_contrato ON pagamento(contrato_plano_id);

CREATE INDEX idx_acompanhamento_aluno ON acompanhamento(aluno_id);

CREATE INDEX idx_acompanhamento_profissional ON acompanhamento(profissional_id);

CREATE INDEX idx_acompanhamento_servico ON acompanhamento(servico_id);