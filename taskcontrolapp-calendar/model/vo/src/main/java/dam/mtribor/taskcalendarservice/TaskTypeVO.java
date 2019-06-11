package dam.mtribor.taskcalendarservice;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum TaskTypeVO {
    HOMEWORK(0), EXAM(1), WORKSHOP(2), OTHER(3);

    private Integer value;
    private static Map<Integer, TaskTypeVO> map = new HashMap<>();

    static {
        for (TaskTypeVO taskTypeVO : TaskTypeVO.values()) {
            map.put(taskTypeVO.value, taskTypeVO);
        }
    }

    public static TaskTypeVO valueOf(int taskTypeValue) {
        return map.get(taskTypeValue);
    }
}
