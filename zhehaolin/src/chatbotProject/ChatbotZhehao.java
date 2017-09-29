package chatbotProject;

public class ChatbotZhehao implements Topic {
	
	private String[] keywords; 
	private String goodbyeWords;
	private String secretWord;
	private boolean chatting;
	
	public ChatbotZhehao()
	{
		String[] temp = {"food","life","school"};
		keywords = temp;
		goodbyeWords = "bye";
		secretWord = "pubg";
	}
	@Override
	public boolean isTriggered(String response) {
		for(int i=0; i<keywords.length;i++)
		{
			if(ChatbotMain.findkeyword(response, keywords[i], 0) >=0)
			{
				return true;
			}
		}
		return false;
	}

	@Override
	public void startChatting(String response) {
		ChatbotMain.print("Hey! we have common interest!Let's talk");
		chatting = true;
		while(chatting)
		{
			response = ChatbotMain.getInput();
			if(ChatbotMain.findkeyword(response, goodbyeWords, 0)>=0)
			{
				chatting = false;
				ChatbotMain.chatbot.startTalking();
			}else if (ChatbotMain.findkeyword(response, secretWord, 0)>=0) {
				ChatbotMain.print("OMG! yOu GuEsS mY kys");
			}else {
				ChatbotMain.print("huh you ugly");
			}
		}
	}

}
