package person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service//빈으로 등록하는 또다른 방법(Component와 동일
public class PersonService {
	
	@Autowired
	PersonMapper personMapper;
	
	public void insertUser(Person person) {
		personMapper.insertPerson(person);
	}
	
	public void updateUser(Person person) {
		personMapper.updatePerson(person);
	}
	//회원가입, 회원정보수정, 삭제, 조회
	
	public void deleteUser(int id) {
		personMapper.deletePerson(0);
	}
	
	public void selectUser(int id) {
		personMapper.selectOne(1);
	}
	
}
