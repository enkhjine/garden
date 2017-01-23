package garden.businessentity;

import java.util.ArrayList;
import java.util.List;

public class Message {

	private String message;
	List<Msg> messages;

	public Message() {
		messages = new ArrayList<Msg>();
		for (int index = 0; index <= 10000; index++) messages.add(new Msg());
		messages.set(0, new Msg("�?мжилттай н�?вт�?рл�?�?.", Tool.msgSuccess));
		messages.set(1, new Msg("�?�?втр�?х н�?р �?�?в�?л нууц үг буруу байна.", Tool.msgWarning));
		messages.set(2, new Msg("", Tool.msgSuccess));
		messages.set(3, new Msg("", Tool.msgSuccess));
		messages.set(4, new Msg("", Tool.msgSuccess));
		messages.set(5, new Msg("", Tool.msgSuccess));
		messages.set(6, new Msg("", Tool.msgSuccess));
		messages.set(7, new Msg("", Tool.msgSuccess));
		messages.set(8, new Msg("", Tool.msgSuccess));
		messages.set(9, new Msg("", Tool.msgSuccess));
		messages.set(10, new Msg("", Tool.msgSuccess));
		messages.set(11, new Msg("", Tool.msgSuccess));
		messages.set(12, new Msg("", Tool.msgSuccess));
		messages.set(13, new Msg("", Tool.msgSuccess));
		messages.set(14, new Msg("", Tool.msgSuccess));
		messages.set(15, new Msg("", Tool.msgSuccess));
		messages.set(16, new Msg("", Tool.msgSuccess));
		messages.set(17, new Msg("", Tool.msgSuccess));
		messages.set(18, new Msg("", Tool.msgSuccess));
		messages.set(19, new Msg("", Tool.msgSuccess));
		messages.set(20, new Msg("", Tool.msgSuccess));
		messages.set(21, new Msg("", Tool.msgSuccess));
		messages.set(22, new Msg("", Tool.msgSuccess));
		messages.set(23, new Msg("", Tool.msgSuccess));
		messages.set(24, new Msg("", Tool.msgSuccess));
		messages.set(25, new Msg("", Tool.msgSuccess));
		messages.set(26, new Msg("", Tool.msgSuccess));
		messages.set(27, new Msg("", Tool.msgSuccess));
		messages.set(28, new Msg("", Tool.msgSuccess));
		messages.set(29, new Msg("", Tool.msgSuccess));
		messages.set(30, new Msg("", Tool.msgSuccess));
		messages.set(31, new Msg("", Tool.msgSuccess));
		messages.set(32, new Msg("", Tool.msgSuccess));
		messages.set(33, new Msg("", Tool.msgSuccess));
		messages.set(34, new Msg("", Tool.msgSuccess));
		messages.set(35, new Msg("", Tool.msgSuccess));
		messages.set(36, new Msg("", Tool.msgSuccess));
		messages.set(37, new Msg("", Tool.msgSuccess));
		messages.set(38, new Msg("", Tool.msgSuccess));
		messages.set(39, new Msg("", Tool.msgSuccess));
		messages.set(40, new Msg("", Tool.msgSuccess));
		messages.set(41, new Msg("", Tool.msgSuccess));
		messages.set(42, new Msg("", Tool.msgSuccess));
		messages.set(43, new Msg("", Tool.msgSuccess));
		messages.set(44, new Msg("", Tool.msgSuccess));
		messages.set(45, new Msg("", Tool.msgSuccess));
		messages.set(46, new Msg("", Tool.msgSuccess));
		messages.set(47, new Msg("", Tool.msgSuccess));
		messages.set(48, new Msg("", Tool.msgSuccess));
		messages.set(49, new Msg("", Tool.msgSuccess));
		messages.set(50, new Msg("", Tool.msgSuccess));
		messages.set(51, new Msg("", Tool.msgSuccess));
		messages.set(52, new Msg("", Tool.msgSuccess));
		messages.set(53, new Msg("", Tool.msgSuccess));
		messages.set(54, new Msg("", Tool.msgSuccess));
		messages.set(55, new Msg("", Tool.msgSuccess));
		messages.set(56, new Msg("", Tool.msgSuccess));
		messages.set(57, new Msg("", Tool.msgSuccess));
		messages.set(58, new Msg("", Tool.msgSuccess));
		messages.set(59, new Msg("", Tool.msgSuccess));
		messages.set(60, new Msg("", Tool.msgSuccess));
		messages.set(61, new Msg("", Tool.msgSuccess));
		messages.set(62, new Msg("", Tool.msgSuccess));
		messages.set(63, new Msg("", Tool.msgSuccess));
		messages.set(64, new Msg("", Tool.msgSuccess));
		messages.set(65, new Msg("", Tool.msgSuccess));
		messages.set(66, new Msg("", Tool.msgSuccess));
		messages.set(67, new Msg("", Tool.msgSuccess));
		messages.set(68, new Msg("", Tool.msgSuccess));
		messages.set(69, new Msg("", Tool.msgSuccess));
		messages.set(70, new Msg("", Tool.msgSuccess));
		messages.set(71, new Msg("", Tool.msgSuccess));
		messages.set(72, new Msg("", Tool.msgSuccess));
		messages.set(73, new Msg("", Tool.msgSuccess));
		messages.set(74, new Msg("", Tool.msgSuccess));
		messages.set(75, new Msg("", Tool.msgSuccess));
		messages.set(76, new Msg("", Tool.msgSuccess));
		messages.set(77, new Msg("", Tool.msgSuccess));
		messages.set(78, new Msg("", Tool.msgSuccess));
		messages.set(79, new Msg("", Tool.msgSuccess));
		messages.set(80, new Msg("", Tool.msgSuccess));
		messages.set(81, new Msg("", Tool.msgSuccess));
		messages.set(82, new Msg("", Tool.msgSuccess));
		messages.set(83, new Msg("", Tool.msgSuccess));
		messages.set(84, new Msg("", Tool.msgSuccess));
		messages.set(85, new Msg("", Tool.msgSuccess));
		messages.set(86, new Msg("", Tool.msgSuccess));
		messages.set(87, new Msg("", Tool.msgSuccess));
		messages.set(88, new Msg("", Tool.msgSuccess));
		messages.set(89, new Msg("", Tool.msgSuccess));
		messages.set(90, new Msg("", Tool.msgSuccess));
		messages.set(91, new Msg("", Tool.msgSuccess));
		messages.set(92, new Msg("", Tool.msgSuccess));
		messages.set(93, new Msg("", Tool.msgSuccess));
		messages.set(94, new Msg("", Tool.msgSuccess));
		messages.set(95, new Msg("", Tool.msgSuccess));
		messages.set(96, new Msg("", Tool.msgSuccess));
		messages.set(97, new Msg("", Tool.msgSuccess));
		messages.set(98, new Msg("", Tool.msgSuccess));
		messages.set(99, new Msg("", Tool.msgSuccess));
	}

	public String getMessage() {
		return message;
	}

	public Msg getMessage(int index) {
		return messages.get(index);

	}

	public void setMessage(String message) {
		this.message = message;
	}

}
