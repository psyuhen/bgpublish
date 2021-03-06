/**
 * 
 */
package com.bgpublish.mapper;

import java.util.List;
import java.util.Map;

import com.bgpublish.domain.ChatOffLineMsg;

/**
 * 离线信息
 * @author ps
 *
 */
public interface ChatOffLineMsgMapper {
	/**
	 * 增加离线信息
	 * @param chatOffLineMsg
	 */
	public void addOffLineMsg(ChatOffLineMsg chatOffLineMsg);
	
	/**
	 * 根据chat_id删除离线信息
	 * @param chat_id
	 */
	public void deleteOffLineMsgById(String chat_id);
	/**
	 * 更新离线信息
	 * @param chatOffLineMsg
	 */
	public void updateOffLineMsg(ChatOffLineMsg chatOffLineMsg);
	
	/**
	 * 根据chat_id查询离线信息
	 * @param chat_id
	 * @return
	 */
	public List<ChatOffLineMsg> queryByChatId(String chat_id);
	
	/**
	 * 根据发送人和接收人查询离线信息
	 * @param map
	 * @return
	 */
	public List<ChatOffLineMsg> queryByUserId(Map<String,String> map);
}
