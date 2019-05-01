package ljx.service.impl;

import ljx.dao.UserDao;
import ljx.service.UserService;
import ljx.transaction.TransactionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;

/**
 * author: LinjianXiong
 * Date: 2019/4/26
 * Time: 17:28
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private TransactionUtils transactionUtils;

//    @Override
//    public void add() {
//        TransactionStatus transactionStatus = null;
//        try {
//            //开启事务
//            transactionStatus = transactionUtils.begin();
//            userDao.add("张三",13);
//            int i = 1/0;
//            System.out.println("############################");
//            userDao.add("李四", 14);
//
//            //提交事务
//            if (transactionStatus != null){
//                transactionUtils.commit(transactionStatus);
//            }
//        }catch (Exception e){
//            e.getMessage();
//            //回滚事务
//            if (transactionStatus != null)
//                transactionUtils.rollback(transactionStatus);
//        }
//    }

    @Override
    public void add(){
        userDao.add("张三",13);
        int i = 1/0;
        System.out.println("############################");
        userDao.add("李四", 14);
    }
}
