package chatbotProject;

public class Chatbot {
	
	private String userName;
	private Topic zhehao;
	private boolean chatting;
	
	
	public Chatbot()
	{
		zhehao = new ChatbotZhehao();
		userName = "unknown user";
		chatting = true;
	}

	public void startTalking() {
		ChatbotMain.print("Welcome to our chatbox! what is your name?");
		userName = ChatbotMain.getInput();
		while(chatting) {
			ChatbotMain.print("what do you want to talk about?");
			String response = ChatbotMain.getInput();
			chatting = true;
			if(zhehao.isTriggered(response)) {
				chatting = false;
				zhehao.startChatting(response);
			}else {
				ChatbotMain.print("I am sorry. I don't understand");
			}
		}
		
	}

}
