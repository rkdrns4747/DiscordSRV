package github.scarsz.discordsrv.api.events;

import lombok.Getter;
import net.dv8tion.jda.api.entities.*;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class JustEvent extends Event {

    private final HandlerList handlers = new HandlerList();
    @Override
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }
    @Getter private final User author;
    @Getter private final TextChannel channel;
    @Getter private final Guild guild;
    @Getter private final Member member;
    @Getter private final Message message;

    public JustEvent(GuildMessageReceivedEvent jdaEvent) {
        this.author = jdaEvent.getAuthor();
        this.channel = jdaEvent.getChannel();
        this.guild = jdaEvent.getGuild();
        this.member = jdaEvent.getMember();
        this.message = jdaEvent.getMessage();
    }

    private User getAuthor() {
        return author;
    }

    private TextChannel getChannel(){
        return channel;
    }

    private Guild getGuild(){
        return guild;
    }

    private Member getMember(){
        return member;
    }

    private Message getMessage(){
        return message;
    }
}
