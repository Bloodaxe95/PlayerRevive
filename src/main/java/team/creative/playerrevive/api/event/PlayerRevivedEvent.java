package team.creative.playerrevive.api.event;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.event.entity.player.PlayerEvent;
import team.creative.playerrevive.api.IBleeding;

/** Fired before a player is revived. */
public class PlayerRevivedEvent extends PlayerEvent {
    
    private final IBleeding bleeding;
    
    public PlayerRevivedEvent(PlayerEntity player, IBleeding bleeding) {
        super(player);
        this.bleeding = bleeding;
    }
    
    public IBleeding getBleeding() {
        return this.bleeding;
    }
}