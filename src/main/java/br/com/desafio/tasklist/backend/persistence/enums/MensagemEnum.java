package br.com.desafio.tasklist.backend.persistence.enums;

/**
 * @author jose-nery
 * 
 * @apiNote MENSAGENS GERAIS DA API
 *
 */
public enum MensagemEnum {

	/**
	 * @implNote MENSAGENS GERAIS DOS SERVIÇOS
	 */
	MSG001, MSG002,

	/**
	 * @implNote MENSAGENS ESPECIFICAS DO SERVIÇO - USUÁRIO
	 */
	MSG_USUARIO_001, MSG_USUARIO_002, MSG_USUARIO_003, MSG_USUARIO_004, MSG_USUARIO_005, MSG_USUARIO_006,
	MSG_USUARIO_007,

	/**
	 * @implNote MENSAGENS ESPECIFICAS DO SERVIÇO - TAREFAS
	 */
	MSG_TAREFA_001, MSG_TAREFA_002, MSG_TAREFA_003, MSG_TAREFA_004, MSG_TAREFA_005, MSG_TAREFA_006, MSG_TAREFA_007,

	/**
	 * @implNote MENSAGENS ESPECIFICAS DO SERVIÇO - CARDS
	 */
	MSG_CARDS_001, MSG_CARDS_002, MSG_CARDS_003, MSG_CARDS_004;
}
