const { MongoClient } = require('mongodb');

async function openTransaction() {
//   const uri = 'mongodb://localhost:27021/?readPreference=primary&ssl=false&directConnection=true';
  // const uri = 'mongodb://anrpts_houwiyeti_user:hgTR125TFRG265POI@102.216.219.44:27017/?authSource=admin&authMechanism=SCRAM-SHA-256&readPreference=primary&ssl=false&directConnection=true';
  const uri = 'mongodb://102.216.219.44:27021/?readPreference=primary&ssl=false&directConnection=true';
  const client = new MongoClient(uri);
  let session;
  try {
    await client.connect();
    session = client.startSession();

    // Start a transaction
    session.startTransaction();

    // Use the session to perform transactional operations
    const collection = client.db('anrpts').collection('test');
    await collection.insertOne({ name: 'John', age: 30 }, { session });
    await collection.insertOne({ name: 'John', age: 30 }, { session });

    await collection.insertOne({ name: 'John', age: 30 }, { session });

    // Commit the transaction
    await session.commitTransaction();
    console.log('sdofijsdo')
  } catch (error) {
    console.error('Transaction aborted:', error);

    // If an error occurs, abort the transaction
    await session.abortTransaction();
  } finally {
    // End the session
    session.endSession();
    client.close();
  }
}

openTransaction();
