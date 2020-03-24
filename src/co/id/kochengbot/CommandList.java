package co.id.kochengbot;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class CommandList extends ListenerAdapter {

	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String[] args = event.getMessage().getContentRaw().split("\\s+");
		//response list
		if(args[0].equalsIgnoreCase(KochengController.prefix + "list")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setTitle("Command List Kocheng");
			embed.setDescription(
					"kocheng\n"+
					"ok\n"+
					"test\n"+
					"meo / memeo\n"+
					"ga kreatif\n"+
					"sodok\n"+
					"telanjang / bugil\n"+
					"rehab / rehabilitas / rebihalitas\n"+
					"sarapan\n"+
					"yan jajan / yan / jajan\n"+
					"woo / pantek\n"+
					"minta / minta duit / bagi duit\n"+
					"bacot / nacot / bavot / baxot / vagot / bagot\n"+
					"ty / thx / thanks\n"+
					"paansi / apasih / apa sih / paan sih / apaan sih / apasi\n"+
					"mei / mei kita / mei gue\n"+
					"jembut / jembud\n"+
					"cupu / cupi / payah");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		
		//info kocheng response
		if(args[0].equalsIgnoreCase(KochengController.prefix + "kocheng")) {
			EmbedBuilder info = new EmbedBuilder();
			info.setTitle("KochengBot");
			info.setDescription("Hai saya kocheng\nKONTOOOOLL");
			info.setFooter("Created by pol ft. warga 45");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(info.build()).queue();
			info.clear();
		}
		
		//main response
		if(args[0].equalsIgnoreCase(KochengController.prefix + "test")) {
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage("tas tes tas tes kontol").queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ok")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.pinimg.com/originals/54/a4/00/54a4008daad4565a9b5db1b94e59c74c.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "meo")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "memeo")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/XJdmMjh.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ga kreatif")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/FrIUGyf.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "sodok")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/ZWi3mNn.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "telanjang")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "bugil")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/mf84I8Z.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "sarapan")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/xKxEJOd.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "rehab") || args[0].equalsIgnoreCase(KochengController.prefix + "rehabilitas")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "rebihalitas")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/aOcfV26.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "yan jajan")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "yan")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "jajan")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/cjfl6hi.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "woo")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "pantek")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/Mi6ivHf.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "minta duit")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "bagi duit")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "minta")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/Al3U0TX.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "bacot")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "bavot")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "nacot")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "baxot")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "vagot")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "bagot")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/wYIWXly.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
			
			embed.setImage("https://i.imgur.com/NkAuRPz.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "ty")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "thx")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "thanks")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/0xqwFvT.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "apasih")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "paansi")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "apa sih")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "paan sih")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "apaan sih")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "apasi")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/PRECnxp.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "mei")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "mei kita")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "mei gue")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/ieyrYKa.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		if(args[0].equalsIgnoreCase(KochengController.prefix + "jembut")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "jembud")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/bux9VXB.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		//not listed yet
		if(args[0].equalsIgnoreCase(KochengController.prefix + "cupu")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "cupi")
				|| args[0].equalsIgnoreCase(KochengController.prefix + "payah")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setImage("https://i.imgur.com/PSMITSa.jpg");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(embed.build()).queue();
		}
		
	}
}
