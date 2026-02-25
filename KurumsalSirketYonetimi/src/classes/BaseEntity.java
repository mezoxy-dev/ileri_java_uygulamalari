package classes;

import interfaces.IIdentifiable;

import java.util.UUID;

public abstract class BaseEntity implements IIdentifiable {
    protected String id;
    protected long createdAt;
    public String getId() { return id; }
    public BaseEntity(){
        this.id = UUID.randomUUID().toString();
    }
    public BaseEntity(String id){this.id = id;}
}
