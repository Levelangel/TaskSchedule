package cn.opom.core;

import java.time.Instant;
import java.util.Objects;

/**
 * 任务调度中的资源
 *
 * @author Albert Chen
 * @date 2018/1/22
 */
public class Resource {

    /**
     * 资源id
     */
    private final int id;
    /**
     * 资源名称
     */
    private final String name;
    /**
     * 资源描述
     */
    private final String description;
    /**
     * 资源空闲时间点
     */
    private Instant finalTime;

    public int getId() {
        return id;
    }

    public Resource(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Resource(int id, String name) {
        this(id, name, null);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Instant getFinalTime() {
        return finalTime;
    }

    public void setFinalTime(Instant finalTime) {
        this.finalTime = finalTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (!(o instanceof Resource)) {return false;}
        Resource resource = (Resource) o;
        return getId() == resource.getId() &&
                Objects.equals(getName(), resource.getName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getName());
    }
}
